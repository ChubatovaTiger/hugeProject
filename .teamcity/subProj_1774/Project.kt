package subProj_1774

import subProj_1774.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1774")
    name = "subProj 1774"

    buildType(subProj_bt_1774_0)
    buildType(subProj_bt_1774_1)
    buildType(subProj_bt_1774_2)
    buildType(subProj_bt_1774_3)
    buildType(subProj_bt_1774_4)
    buildType(subProj_bt_1774_5)
})
