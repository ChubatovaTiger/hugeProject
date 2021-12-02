package subProj_306

import subProj_306.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_306")
    name = "subProj 306"

    buildType(subProj_bt_306_1)
    buildType(subProj_bt_306_2)
    buildType(subProj_bt_306_0)
    buildType(subProj_bt_306_5)
    buildType(subProj_bt_306_3)
    buildType(subProj_bt_306_4)
})
