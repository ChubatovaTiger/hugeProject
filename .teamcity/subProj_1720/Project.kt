package subProj_1720

import subProj_1720.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1720")
    name = "subProj 1720"

    buildType(subProj_bt_1720_4)
    buildType(subProj_bt_1720_5)
    buildType(subProj_bt_1720_2)
    buildType(subProj_bt_1720_3)
    buildType(subProj_bt_1720_0)
    buildType(subProj_bt_1720_1)
})
