package subProj_1648

import subProj_1648.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1648")
    name = "subProj 1648"

    buildType(subProj_bt_1648_2)
    buildType(subProj_bt_1648_1)
    buildType(subProj_bt_1648_4)
    buildType(subProj_bt_1648_3)
    buildType(subProj_bt_1648_5)
    buildType(subProj_bt_1648_0)
})
