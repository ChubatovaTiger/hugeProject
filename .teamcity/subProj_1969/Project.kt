package subProj_1969

import subProj_1969.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1969")
    name = "subProj 1969"

    buildType(subProj_bt_1969_3)
    buildType(subProj_bt_1969_4)
    buildType(subProj_bt_1969_5)
    buildType(subProj_bt_1969_0)
    buildType(subProj_bt_1969_1)
    buildType(subProj_bt_1969_2)
})
