package subProj_247

import subProj_247.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_247")
    name = "subProj 247"

    buildType(subProj_bt_247_5)
    buildType(subProj_bt_247_3)
    buildType(subProj_bt_247_4)
    buildType(subProj_bt_247_1)
    buildType(subProj_bt_247_2)
    buildType(subProj_bt_247_0)
})
