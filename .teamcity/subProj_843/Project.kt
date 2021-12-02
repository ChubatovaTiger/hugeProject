package subProj_843

import subProj_843.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_843")
    name = "subProj 843"

    buildType(subProj_bt_843_5)
    buildType(subProj_bt_843_0)
    buildType(subProj_bt_843_3)
    buildType(subProj_bt_843_4)
    buildType(subProj_bt_843_1)
    buildType(subProj_bt_843_2)
})
