/**
 * Copyright 2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * You may not use this file except in compliance with the License. A copy of the License is located the "LICENSE.txt"
 * file accompanying this source. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing permissions and limitations
 * under the License.
 */
package com.amazon.alexa.avs.message.response.audioplayer;

public final class AudioItem {
    private String audioItemId;
    private Stream stream;

    public String getAudioItemId() {
        return audioItemId;
    }

    public Stream getStream() {
        return stream;
    }

    public void setAudioItemId(String audioItemId) {
        this.audioItemId = audioItemId;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }
}