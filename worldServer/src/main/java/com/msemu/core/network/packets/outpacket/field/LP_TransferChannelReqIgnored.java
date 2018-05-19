package com.msemu.core.network.packets.outpacket.field;

import com.msemu.commons.enums.OutHeader;
import com.msemu.commons.network.packets.OutPacket;
import com.msemu.core.network.GameClient;
import com.msemu.world.enums.TransferChannelReqIgnoredType;

/**
 * Created by Weber on 2018/5/12.
 */
public class LP_TransferChannelReqIgnored extends OutPacket<GameClient> {

    public LP_TransferChannelReqIgnored(TransferChannelReqIgnoredType type) {
        super(OutHeader.LP_TransferChannelReqIgnored);
        encodeByte(type.getValue());

    }
}