package subProj_1510

import subProj_1510.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1510")
    name = "subProj 1510"

    buildType(subProj_bt_1510_0)
    buildType(subProj_bt_1510_2)
    buildType(subProj_bt_1510_1)
    buildType(subProj_bt_1510_4)
    buildType(subProj_bt_1510_3)
    buildType(subProj_bt_1510_5)
})
