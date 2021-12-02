package subProj_1533

import subProj_1533.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1533")
    name = "subProj 1533"

    buildType(subProj_bt_1533_0)
    buildType(subProj_bt_1533_1)
    buildType(subProj_bt_1533_4)
    buildType(subProj_bt_1533_5)
    buildType(subProj_bt_1533_2)
    buildType(subProj_bt_1533_3)
})
