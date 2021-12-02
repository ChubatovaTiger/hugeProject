package subProj_281

import subProj_281.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_281")
    name = "subProj 281"

    buildType(subProj_bt_281_0)
    buildType(subProj_bt_281_5)
    buildType(subProj_bt_281_4)
    buildType(subProj_bt_281_3)
    buildType(subProj_bt_281_2)
    buildType(subProj_bt_281_1)
})
