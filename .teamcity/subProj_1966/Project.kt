package subProj_1966

import subProj_1966.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1966")
    name = "subProj 1966"

    buildType(subProj_bt_1966_0)
    buildType(subProj_bt_1966_1)
    buildType(subProj_bt_1966_2)
    buildType(subProj_bt_1966_3)
    buildType(subProj_bt_1966_4)
    buildType(subProj_bt_1966_5)
})
