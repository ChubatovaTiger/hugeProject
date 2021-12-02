package subProj_1848

import subProj_1848.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1848")
    name = "subProj 1848"

    buildType(subProj_bt_1848_4)
    buildType(subProj_bt_1848_3)
    buildType(subProj_bt_1848_5)
    buildType(subProj_bt_1848_0)
    buildType(subProj_bt_1848_2)
    buildType(subProj_bt_1848_1)
})
