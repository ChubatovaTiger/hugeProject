package subProj_1238

import subProj_1238.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1238")
    name = "subProj 1238"

    buildType(subProj_bt_1238_0)
    buildType(subProj_bt_1238_1)
    buildType(subProj_bt_1238_2)
    buildType(subProj_bt_1238_3)
    buildType(subProj_bt_1238_4)
    buildType(subProj_bt_1238_5)
})
