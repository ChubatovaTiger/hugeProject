package subProj_340

import subProj_340.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_340")
    name = "subProj 340"

    buildType(subProj_bt_340_5)
    buildType(subProj_bt_340_1)
    buildType(subProj_bt_340_2)
    buildType(subProj_bt_340_3)
    buildType(subProj_bt_340_4)
    buildType(subProj_bt_340_0)
})
