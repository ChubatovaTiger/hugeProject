package subProj_36

import subProj_36.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_36")
    name = "subProj 36"

    buildType(subProj_bt_36_0)
    buildType(subProj_bt_36_1)
    buildType(subProj_bt_36_2)
    buildType(subProj_bt_36_3)
    buildType(subProj_bt_36_4)
    buildType(subProj_bt_36_5)
})
