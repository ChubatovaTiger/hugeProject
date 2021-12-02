package subProj_1369

import subProj_1369.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1369")
    name = "subProj 1369"

    buildType(subProj_bt_1369_0)
    buildType(subProj_bt_1369_1)
    buildType(subProj_bt_1369_2)
    buildType(subProj_bt_1369_3)
    buildType(subProj_bt_1369_4)
    buildType(subProj_bt_1369_5)
})
