package subProj_1480

import subProj_1480.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1480")
    name = "subProj 1480"

    buildType(subProj_bt_1480_5)
    buildType(subProj_bt_1480_3)
    buildType(subProj_bt_1480_4)
    buildType(subProj_bt_1480_1)
    buildType(subProj_bt_1480_2)
    buildType(subProj_bt_1480_0)
})
