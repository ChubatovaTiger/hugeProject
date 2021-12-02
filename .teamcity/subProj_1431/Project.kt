package subProj_1431

import subProj_1431.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1431")
    name = "subProj 1431"

    buildType(subProj_bt_1431_0)
    buildType(subProj_bt_1431_5)
    buildType(subProj_bt_1431_1)
    buildType(subProj_bt_1431_2)
    buildType(subProj_bt_1431_3)
    buildType(subProj_bt_1431_4)
})
