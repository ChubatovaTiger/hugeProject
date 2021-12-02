package subProj_34

import subProj_34.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_34")
    name = "subProj 34"

    buildType(subProj_bt_34_0)
    buildType(subProj_bt_34_1)
    buildType(subProj_bt_34_2)
    buildType(subProj_bt_34_3)
    buildType(subProj_bt_34_4)
    buildType(subProj_bt_34_5)
})
