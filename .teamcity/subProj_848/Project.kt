package subProj_848

import subProj_848.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_848")
    name = "subProj 848"

    buildType(subProj_bt_848_2)
    buildType(subProj_bt_848_3)
    buildType(subProj_bt_848_0)
    buildType(subProj_bt_848_1)
    buildType(subProj_bt_848_4)
    buildType(subProj_bt_848_5)
})
