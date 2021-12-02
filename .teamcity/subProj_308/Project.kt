package subProj_308

import subProj_308.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_308")
    name = "subProj 308"

    buildType(subProj_bt_308_0)
    buildType(subProj_bt_308_3)
    buildType(subProj_bt_308_4)
    buildType(subProj_bt_308_1)
    buildType(subProj_bt_308_2)
    buildType(subProj_bt_308_5)
})
