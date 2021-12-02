package subProj_822

import subProj_822.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_822")
    name = "subProj 822"

    buildType(subProj_bt_822_5)
    buildType(subProj_bt_822_4)
    buildType(subProj_bt_822_1)
    buildType(subProj_bt_822_0)
    buildType(subProj_bt_822_3)
    buildType(subProj_bt_822_2)
})
