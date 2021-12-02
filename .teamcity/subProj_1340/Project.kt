package subProj_1340

import subProj_1340.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1340")
    name = "subProj 1340"

    buildType(subProj_bt_1340_2)
    buildType(subProj_bt_1340_3)
    buildType(subProj_bt_1340_0)
    buildType(subProj_bt_1340_1)
    buildType(subProj_bt_1340_4)
    buildType(subProj_bt_1340_5)
})
