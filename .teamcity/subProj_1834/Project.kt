package subProj_1834

import subProj_1834.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1834")
    name = "subProj 1834"

    buildType(subProj_bt_1834_1)
    buildType(subProj_bt_1834_0)
    buildType(subProj_bt_1834_3)
    buildType(subProj_bt_1834_2)
    buildType(subProj_bt_1834_5)
    buildType(subProj_bt_1834_4)
})
