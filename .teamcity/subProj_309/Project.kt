package subProj_309

import subProj_309.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_309")
    name = "subProj 309"

    buildType(subProj_bt_309_2)
    buildType(subProj_bt_309_3)
    buildType(subProj_bt_309_0)
    buildType(subProj_bt_309_1)
    buildType(subProj_bt_309_4)
    buildType(subProj_bt_309_5)
})
