package subProj_886

import subProj_886.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_886")
    name = "subProj 886"

    buildType(subProj_bt_886_2)
    buildType(subProj_bt_886_3)
    buildType(subProj_bt_886_4)
    buildType(subProj_bt_886_5)
    buildType(subProj_bt_886_0)
    buildType(subProj_bt_886_1)
})
