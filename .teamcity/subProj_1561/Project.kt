package subProj_1561

import subProj_1561.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1561")
    name = "subProj 1561"

    buildType(subProj_bt_1561_0)
    buildType(subProj_bt_1561_1)
    buildType(subProj_bt_1561_2)
    buildType(subProj_bt_1561_3)
    buildType(subProj_bt_1561_4)
    buildType(subProj_bt_1561_5)
})
