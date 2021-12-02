package subProj_379

import subProj_379.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_379")
    name = "subProj 379"

    buildType(subProj_bt_379_4)
    buildType(subProj_bt_379_3)
    buildType(subProj_bt_379_5)
    buildType(subProj_bt_379_0)
    buildType(subProj_bt_379_2)
    buildType(subProj_bt_379_1)
})
