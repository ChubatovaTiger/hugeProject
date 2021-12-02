package subProj_91

import subProj_91.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_91")
    name = "subProj 91"

    buildType(subProj_bt_91_5)
    buildType(subProj_bt_91_4)
    buildType(subProj_bt_91_3)
    buildType(subProj_bt_91_2)
    buildType(subProj_bt_91_1)
    buildType(subProj_bt_91_0)
})
