package subProj_1818

import subProj_1818.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1818")
    name = "subProj 1818"

    buildType(subProj_bt_1818_4)
    buildType(subProj_bt_1818_5)
    buildType(subProj_bt_1818_0)
    buildType(subProj_bt_1818_1)
    buildType(subProj_bt_1818_2)
    buildType(subProj_bt_1818_3)
})
