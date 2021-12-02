package subProj_777

import subProj_777.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_777")
    name = "subProj 777"

    buildType(subProj_bt_777_5)
    buildType(subProj_bt_777_2)
    buildType(subProj_bt_777_1)
    buildType(subProj_bt_777_4)
    buildType(subProj_bt_777_3)
    buildType(subProj_bt_777_0)
})
