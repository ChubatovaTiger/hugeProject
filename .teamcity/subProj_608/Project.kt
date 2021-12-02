package subProj_608

import subProj_608.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_608")
    name = "subProj 608"

    buildType(subProj_bt_608_2)
    buildType(subProj_bt_608_3)
    buildType(subProj_bt_608_4)
    buildType(subProj_bt_608_5)
    buildType(subProj_bt_608_0)
    buildType(subProj_bt_608_1)
})
