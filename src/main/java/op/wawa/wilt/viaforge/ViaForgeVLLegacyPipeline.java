/*
 * This file is part of ViaForge - https://github.com/FlorianMichael/ViaForge
 * Copyright (C) 2021-2023 FlorianMichael/EnZaXD and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package op.wawa.wilt.viaforge;

import com.viaversion.viaversion.api.connection.UserConnection;
import net.raphimc.vialoader.netty.VLLegacyPipeline;
import net.raphimc.vialoader.util.VersionEnum;

public class ViaForgeVLLegacyPipeline extends VLLegacyPipeline {
    public ViaForgeVLLegacyPipeline(UserConnection user, VersionEnum version) {
        super(user, version);
    }

    public String decompressName() {
        return "decompress";
    }

    public String compressName() {
        return "compress";
    }

    public String packetDecoderName() {
        return "decoder";
    }

    public String packetEncoderName() {
        return "encoder";
    }

    public String lengthSplitterName() {
        return "splitter";
    }

    public String lengthPrependerName() {
        return "prepender";
    }
}
