package subProj_1582

import subProj_1582.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1582")
    name = "subProj 1582"

    buildType(subProj_bt_1582_1)
    buildType(subProj_bt_1582_0)
    buildType(subProj_bt_1582_3)
    buildType(subProj_bt_1582_2)
    buildType(subProj_bt_1582_5)
    buildType(subProj_bt_1582_4)
})
