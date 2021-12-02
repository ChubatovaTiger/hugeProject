package subProj_1937

import subProj_1937.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1937")
    name = "subProj 1937"

    buildType(subProj_bt_1937_1)
    buildType(subProj_bt_1937_0)
    buildType(subProj_bt_1937_5)
    buildType(subProj_bt_1937_4)
    buildType(subProj_bt_1937_3)
    buildType(subProj_bt_1937_2)
})
