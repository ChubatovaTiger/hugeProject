package subProj_707

import subProj_707.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_707")
    name = "subProj 707"

    buildType(subProj_bt_707_0)
    buildType(subProj_bt_707_1)
    buildType(subProj_bt_707_4)
    buildType(subProj_bt_707_5)
    buildType(subProj_bt_707_2)
    buildType(subProj_bt_707_3)
})
