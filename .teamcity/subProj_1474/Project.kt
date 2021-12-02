package subProj_1474

import subProj_1474.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1474")
    name = "subProj 1474"

    buildType(subProj_bt_1474_0)
    buildType(subProj_bt_1474_1)
    buildType(subProj_bt_1474_4)
    buildType(subProj_bt_1474_5)
    buildType(subProj_bt_1474_2)
    buildType(subProj_bt_1474_3)
})
