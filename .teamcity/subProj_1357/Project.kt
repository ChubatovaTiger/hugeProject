package subProj_1357

import subProj_1357.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1357")
    name = "subProj 1357"

    buildType(subProj_bt_1357_5)
    buildType(subProj_bt_1357_4)
    buildType(subProj_bt_1357_3)
    buildType(subProj_bt_1357_2)
    buildType(subProj_bt_1357_1)
    buildType(subProj_bt_1357_0)
})
