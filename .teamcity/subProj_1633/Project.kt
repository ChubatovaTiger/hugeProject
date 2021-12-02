package subProj_1633

import subProj_1633.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1633")
    name = "subProj 1633"

    buildType(subProj_bt_1633_5)
    buildType(subProj_bt_1633_0)
    buildType(subProj_bt_1633_1)
    buildType(subProj_bt_1633_2)
    buildType(subProj_bt_1633_3)
    buildType(subProj_bt_1633_4)
})
