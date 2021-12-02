package subProj_1866

import subProj_1866.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1866")
    name = "subProj 1866"

    buildType(subProj_bt_1866_1)
    buildType(subProj_bt_1866_2)
    buildType(subProj_bt_1866_0)
    buildType(subProj_bt_1866_5)
    buildType(subProj_bt_1866_3)
    buildType(subProj_bt_1866_4)
})
