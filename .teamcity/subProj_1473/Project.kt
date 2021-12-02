package subProj_1473

import subProj_1473.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1473")
    name = "subProj 1473"

    buildType(subProj_bt_1473_1)
    buildType(subProj_bt_1473_2)
    buildType(subProj_bt_1473_0)
    buildType(subProj_bt_1473_5)
    buildType(subProj_bt_1473_3)
    buildType(subProj_bt_1473_4)
})
