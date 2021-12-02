package subProj_33

import subProj_33.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_33")
    name = "subProj 33"

    buildType(subProj_bt_33_0)
    buildType(subProj_bt_33_1)
    buildType(subProj_bt_33_2)
    buildType(subProj_bt_33_3)
    buildType(subProj_bt_33_4)
    buildType(subProj_bt_33_5)
})
