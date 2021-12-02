package subProj_593

import subProj_593.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_593")
    name = "subProj 593"

    buildType(subProj_bt_593_5)
    buildType(subProj_bt_593_0)
    buildType(subProj_bt_593_3)
    buildType(subProj_bt_593_4)
    buildType(subProj_bt_593_1)
    buildType(subProj_bt_593_2)
})
