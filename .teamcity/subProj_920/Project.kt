package subProj_920

import subProj_920.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_920")
    name = "subProj 920"

    buildType(subProj_bt_920_4)
    buildType(subProj_bt_920_3)
    buildType(subProj_bt_920_2)
    buildType(subProj_bt_920_1)
    buildType(subProj_bt_920_0)
    buildType(subProj_bt_920_5)
})
