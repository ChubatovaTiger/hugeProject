package subProj_484

import subProj_484.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_484")
    name = "subProj 484"

    buildType(subProj_bt_484_4)
    buildType(subProj_bt_484_5)
    buildType(subProj_bt_484_0)
    buildType(subProj_bt_484_1)
    buildType(subProj_bt_484_2)
    buildType(subProj_bt_484_3)
})
