package subProj_966

import subProj_966.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_966")
    name = "subProj 966"

    buildType(subProj_bt_966_4)
    buildType(subProj_bt_966_3)
    buildType(subProj_bt_966_5)
    buildType(subProj_bt_966_0)
    buildType(subProj_bt_966_2)
    buildType(subProj_bt_966_1)
})
