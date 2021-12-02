package subProj_1829

import subProj_1829.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1829")
    name = "subProj 1829"

    buildType(subProj_bt_1829_4)
    buildType(subProj_bt_1829_5)
    buildType(subProj_bt_1829_0)
    buildType(subProj_bt_1829_1)
    buildType(subProj_bt_1829_2)
    buildType(subProj_bt_1829_3)
})
