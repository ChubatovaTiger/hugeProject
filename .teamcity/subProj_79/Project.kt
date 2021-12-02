package subProj_79

import subProj_79.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_79")
    name = "subProj 79"

    buildType(subProj_bt_79_2)
    buildType(subProj_bt_79_3)
    buildType(subProj_bt_79_0)
    buildType(subProj_bt_79_1)
    buildType(subProj_bt_79_4)
    buildType(subProj_bt_79_5)
})
