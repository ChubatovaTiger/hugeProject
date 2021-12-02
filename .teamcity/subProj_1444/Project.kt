package subProj_1444

import subProj_1444.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1444")
    name = "subProj 1444"

    buildType(subProj_bt_1444_4)
    buildType(subProj_bt_1444_3)
    buildType(subProj_bt_1444_5)
    buildType(subProj_bt_1444_0)
    buildType(subProj_bt_1444_2)
    buildType(subProj_bt_1444_1)
})
