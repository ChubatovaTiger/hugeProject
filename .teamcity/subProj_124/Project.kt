package subProj_124

import subProj_124.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_124")
    name = "subProj 124"

    buildType(subProj_bt_124_5)
    buildType(subProj_bt_124_4)
    buildType(subProj_bt_124_3)
    buildType(subProj_bt_124_2)
    buildType(subProj_bt_124_1)
    buildType(subProj_bt_124_0)
})
