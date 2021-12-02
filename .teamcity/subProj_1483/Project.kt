package subProj_1483

import subProj_1483.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1483")
    name = "subProj 1483"

    buildType(subProj_bt_1483_2)
    buildType(subProj_bt_1483_3)
    buildType(subProj_bt_1483_0)
    buildType(subProj_bt_1483_1)
    buildType(subProj_bt_1483_4)
    buildType(subProj_bt_1483_5)
})
