package subProj_1593

import subProj_1593.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1593")
    name = "subProj 1593"

    buildType(subProj_bt_1593_1)
    buildType(subProj_bt_1593_0)
    buildType(subProj_bt_1593_3)
    buildType(subProj_bt_1593_2)
    buildType(subProj_bt_1593_5)
    buildType(subProj_bt_1593_4)
})
